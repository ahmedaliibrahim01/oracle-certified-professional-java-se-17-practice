package com.ahmedaliibrahim.chapter01.understanding_the_class_structure;

// Most of the time, each Java class is defined in its own .java file.
// A top-level class is often public, which means any code can call it.
// If you do have a public type, it needs to match the filename.

/*public */ class AnimalV2 { // ONLY AnimalV2 class can be public in this source file.
    private String name;
}

// You can even put two types in the same file.
// When you do so, at most one of the toplevel types in the file is allowed to be public.
class Animal2 {
}

// public class Animal3{} // Compile Error
