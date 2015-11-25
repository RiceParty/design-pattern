# Design Pattern

### self practice for dp
1. `abstract factory` can initialize object from different ways without break origin code. 

  Really a good way to produce objects so it's called factory pattern.
  
  Naming abstract because factories are designed to be abstract. So when new objects are creating, only new abstract factory and new object files are created, no invading old codes.
  
  ~~~
example: produce gift for girls.
~~~

2. `factory` can initialize object from different params.

  But everytime you want a new type of object, inserting new code would be done, which is not expected.
  
  ~~~
  example: produce gifts too. params and enum ways.
  ~~~

3. `strategy` is used for different action.

  when we want to do a certain operation to a obj, we can seperate operation's definition and implement. 
  
  So that we can put whatever operation we want to affect this obj.
  
  ~~~
  example: i want to make a gift by judging my budget. Like a filter.
  ~~~

4. `adapter` to be continued

## I wish i can keep on coding contiuous ~~
