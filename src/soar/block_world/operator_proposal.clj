(ns soar.block-world.operator-proposal)

"An operator is proposed by a rule that tests the current state and creates an acceptable
preference for an operator. An operator-proposal rule usually creates additional workingmemory
elements that provide a declarative description of the operator, such as its
name and parameters"

"P5*propose*operator*move-block
If the state has problem space move-single-unit-block and
   there is a block and
   that block is clear and
   there is a second object that is clear and
   the block is not on the table and being moved to the table
Then
   create a move-block operator to
     move the block on to the second object and
   create an acceptable preference for that operator"



