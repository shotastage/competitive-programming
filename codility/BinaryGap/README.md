# BinaryGap



問題は与えられた十進数を二進数にした時の1と１の間の0の数のうち最大のものを返却するというものである。例えば、`2020`の二進数は`11111100100`であるが1と1に挟まれた0の最大値は2である。



# Solution

今回はSwiftとJavaのSolutionを作成した。

## Swift

二つの変数**`previousGapCount: Int = 0`**と**`currentGapCount: Int = 0`**を設けた。

Swiftは`String(Integer, radix: 2)`のようにして整数を二進数の文字列に変換できる。これを利用して`for char in string`で一文字ずつ処理を行う。

`char == "0"`だった場合は**previousGapCount**を1カウントアップする。

`char == "1" `だった場合は１区間の0Gap countである**currentGapCount**が前区間の**previousGapCount**を上回った場合のみ**previousGapCount**の値が更新される。

これにより、**previousGapCount**は常に最大の0Gapカウントが格納される。また、0が存在しない場合は初期値の0が返却される。



## Java

Javaの実装も基本的な流れはSwiftと同一である。

Javaでは`Integer.toBinaryString(N)`を用い、二進数のStringに変換できる。

また、Swiftの`for char in string`で暗黙的な文字列分解が行われないためString配列` String[] binary = Integer.toBinaryString(N).split("");`が追加されている。



注意点として、文字列の比較演算において("S" == "S")が必ずしもTrueではないというポイントである。String[]配列のString[i]要素が**S**出会っても`S`とはオブジェクトが異なりTrueとはならない。従って`  (binary[i].equals("1"))`のようなequalsメソッドを用いる。

