# RandomizedDataGenerator
Java class that allows data to be specified to have specific probabilities of certain values. Then any amount of this data can be generated one at a time.

The classes are pretty well documented, but some more explanation will be given here. 

The Driver class is just supplementary, but it was used to give an example of how the code works and how it could be used.

The way it works is, the primary method of the Randomizer class is randNum. This method takes a Map<Integer, Double> as a parameter and this should be a map that contains all the integers to be output and their corresponding probabilities. Ideally, this map needs to contain all the values such that the Doubles add up to one for probability sake.

Also, the randomizer holds a list of all the outputted values, which allows them to be replayed in the same order, or the user can just get the entire list.

This class could be easily adjusted to generate things other than Integers. In fact, it could probably easily be made a generic class, but it was not necessary at the time of writing this class, maybe in the future.
