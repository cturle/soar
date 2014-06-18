(ns soar.block-world.state-elaboration)

"p81"

"Elaborating the state can simplify later calculations by making concepts explicit that are implicit in the configuration
of existing workingmemory elements. For example, if there is no block above a block, then it can be concluded that the second
block is clear, which can be a condition for moving the block or placing a block on top of it."

"elaboration rules (rules not involved in operator application) retract the structures they have created when
they no longer match. This is called instantiation-support , or i-support , as the instantiation provides
support for the working-memory elements."

"For example, if an operator is proposed to move block A on block B, one of the conditions in the proposal rule is
that block B is clear. When the operator is selected and applied so that block B is no longer clear,
the proposal for moving block A on block B is automatically retracted."

"Within Elaboration, additional waves of rule firing and retraction continue until quiescence — when no more rules
match or retract."

"In Soar, a state elaboration tests only non-operator structures connected to the state, and creates new state structures
but does not create any operator preferences."

"P1*elaborate*block*clear*
 If there is a block and
    there is nothing on top of that block
 Then
    that block is clear"

"P2*elaborate*table*clear*
 If there is the table
 Then
    the Table is clear"




