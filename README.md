# Latrine
[![Travis build](https://api.travis-ci.org/venth/latrine.svg?branch=master)](https://api.travis-ci.org/venth/latrine.svg?branch=master)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.venth.tools/latrine.svg?style=plastic)]()

The purpose is to easier documentation anything you would like flush with water and you're forced to live with it for a while.

## Idea
The project's idea was born in a head of one of my colleagues during hacking on shitty library
to remove some of its features that prevented an application to bootstrap properly.

He marked the code with shitty shit comment and explanation. After few more plumbing works team
decided to improve on marking such code by usage of ```@ShittyShit``` annotation.

## Usage
If you're about to use this annotation, I feel sorry for you. Nevertheless please do not hesitate yourself to apply it to shitty code, which purpose to pull you out of the deep shit you're in.

Just remember to provide explanation, otherwise a reader might think that you dragged him into a deep shit.

Equipment applications latrine as follows:

* gradle

```
compile 'com.github.venth.tools:latrine:x.y.z
```

* maven

```
<dependency>
    <groupId>com.github.venth.tools</groupId>
    <artifactId>latrine</artifactId>
    <version>x.y.z</version>
</dependency>
```

Then you can start marking introduced ```@ShittyShit``` and providing explanation how it pulled out
the application from a deep shit.

## Examples
Few examples:
* Fixing bug in a library which has a buggy final class by introduction
  in application's code a class in the same package as the buggy one
* Using reflection to access private, not exposed fields containing measures needed for monitoring
  purposes
