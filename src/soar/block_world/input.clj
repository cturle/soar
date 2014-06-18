(ns soar.block-world.input)

; ==== §4.3.1 Input ===

; soar
(S1 ^io I1)
 (I1 ^input-link I2)
  (I2 ^thing B1 B2 B3 T1)
   (B1 ^type Block, ^label A, ^size 1, ^color red, ^on B2)
   (B2 ^type Block, ^label B, ^size 1, ^color blue, ^on T1)
   (B3 ^type Block, ^label C, ^size 1, ^color green, ^on T1)
   (T1 ^type Table, ^label Table)

; commentaires
; I1 pour désigner input-outpu-t ? pourquoi pas les liens directement sur S1 ?
(S1 ^input-link I1 )
  (I1 ^thing B1 B2 B3 T1)
   (B1 ^type Block, ^label A, ^size 1, ^color red, ^on B2)
   (B2 ^type Block, ^label B, ^size 1, ^color blue, ^on T1)
   (B3 ^type Block, ^label C, ^size 1, ^color green, ^on T1)
   (T1 ^type Table, ^label Table)

