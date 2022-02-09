val textFile = sc.textFile("README.md")
textFile.collect
var map = textFile.flatMap(line => line.split(" ")).map(word => (word,1))
map.collect
var counts = map.reduceByKey(_+_)
counts.collect
counts.saveAsTextFile("README2.md")