package com.tcl.ej.i16;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author tcl
 */
public class CountSet<E> extends WrapperSet<E> {

    private AtomicLong count = new AtomicLong(0);

    public CountSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e) {
        count.incrementAndGet();
        return super.add(e);
    }


    @Override
    public boolean addAll(Collection<? extends E> c) {
        count.addAndGet(c.size());
        return super.addAll(c);
    }

    public long getCount() {
        return count.get();
    }


    public static void main(String[] args) {
        CountSet<String> countSet = new CountSet<String>(Sets.<String>newHashSet());

        countSet.add("asf");
        countSet.add("asf");
        countSet.add("sff");
        countSet.addAll(Lists.newArrayList("fa","fads"));

        System.out.println(countSet.getCount());
        System.out.println(countSet.toString());
    }
}
