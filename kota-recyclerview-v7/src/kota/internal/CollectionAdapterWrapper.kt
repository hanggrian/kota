@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.internal

import android.support.v7.widget.RecyclerView

open class CollectionAdapterWrapper<E, out T : MutableCollection<E>> internal constructor(
        internal val collection: T,
        internal val adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>
) : MutableCollection<E> {

    override val size: Int get() = collection.size
    override fun isEmpty(): Boolean = collection.isEmpty()
    override fun iterator(): MutableIterator<E> = collection.iterator()
    override fun contains(element: E): Boolean = collection.contains(element)
    override fun containsAll(elements: Collection<E>): Boolean = collection.containsAll(elements)

    override fun add(element: E): Boolean {
        val result = collection.add(element)
        if (result) adapter.notifyItemInserted(size - 1)
        return result
    }

    override fun remove(element: E): Boolean {
        val index = collection.indexOf(element)
        val result = collection.remove(element)
        if (result) adapter.notifyItemRemoved(index)
        return result
    }

    override fun addAll(elements: Collection<E>): Boolean {
        val start = size + 1
        val result = collection.addAll(elements)
        if (result) adapter.notifyItemRangeInserted(start, elements.size)
        return result
    }

    override fun removeAll(elements: Collection<E>): Boolean {
        val items = elements.map { collection.indexOf(it) }
        val result = collection.removeAll(elements)
        if (result) items.forEach { adapter.notifyItemRemoved(it) }
        return result
    }

    override fun retainAll(elements: Collection<E>): Boolean {
        val result = collection.retainAll(elements)
        if (result) adapter.notifyDataSetChanged()
        return result
    }

    override fun clear() {
        val size = size
        collection.clear()
        adapter.notifyItemRangeRemoved(0, size)
    }
}

class ListAdapterWrapper<E, out T : MutableList<E>> @PublishedApi internal constructor(
        collection: T,
        adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>
) : CollectionAdapterWrapper<E, T>(collection, adapter), MutableList<E> {

    override fun get(index: Int): E = collection[index]
    override fun indexOf(element: E): Int = collection.indexOf(element)
    override fun lastIndexOf(element: E): Int = collection.lastIndexOf(element)

    override fun add(index: Int, element: E) {
        collection.add(index, element)
        adapter.notifyItemInserted(index)
    }

    override fun addAll(index: Int, elements: Collection<E>): Boolean {
        val start = size + 1
        val result = collection.addAll(elements)
        if (result) adapter.notifyItemRangeInserted(start, elements.size)
        return result
    }

    override fun listIterator(): MutableListIterator<E> = collection.listIterator()
    override fun listIterator(index: Int): MutableListIterator<E> = listIterator(index)

    override fun removeAt(index: Int): E {
        val result = collection.removeAt(index)
        if (result != null) adapter.notifyItemRemoved(index)
        return result
    }

    override fun set(index: Int, element: E): E {
        val result = collection.set(index, element)
        if (result != null) adapter.notifyItemChanged(index)
        return result
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<E> = collection.subList(fromIndex, toIndex)
}

class SetAdapterWrapper<E, out T : MutableSet<E>> @PublishedApi internal constructor(
        collection: T,
        adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>
) : CollectionAdapterWrapper<E, T>(collection, adapter), MutableSet<E> {

    override fun add(element: E): Boolean {
        val result = collection.add(element)
        if (result) adapter.notifyItemInserted(indexOf(element) - 1)
        return result
    }

    override fun addAll(elements: Collection<E>): Boolean {
        val result = collection.addAll(elements)
        if (result) adapter.notifyDataSetChanged()
        return result
    }

    override fun removeAll(elements: Collection<E>): Boolean {
        val result = collection.removeAll(elements)
        if (result) adapter.notifyDataSetChanged()
        return result
    }
}