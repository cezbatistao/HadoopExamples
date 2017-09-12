Para fazer a build do projeto:
```bash
gradle build
```

Copiar o *jar* gerado dentro da pasta _build/libs/HadoopTests-1.0-SNAPSHOT.jar_ para a pasta *__$HADOOP__/share/hadoop/mapreduce/*

Criar a seguinte pasta:
```bash
mkdir ~/input
```

E copiar alguns arquivos .txt para dentro da pasta _~/input_

Executar o seguinte comando:
```bash
hadoop jar $HADOOP/share/hadoop/mapreduce/HadoopTests-1.0-SNAPSHOT.jar br.com.batistao.hadoop.mapreduce.firstwordcount.FirstWordCountApp ~/input/ ~/output/
```

Para chegar o resultado:
```bash
cat ~/output/*
```

Um exemplo de resultado:
```bash
"            18
(            47
*            6
-            21
/            3
1            36
2            14
3            16
4            11
5            4
6            12
7            4
8            3
9            2
=            3
EMPTY        371
a            113
b            27
c            119
d            56
e            35
f            59
g            13
h            33
i            67
j            19
l            57
m            42
n            27
o            80
p            60
r            49
s            72
t            192
u            15
v            4
w            54
x            3
y            16
“            1
```
