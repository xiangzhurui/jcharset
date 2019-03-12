# jcharset
Java port of Automatic charset deduction module from Mozilla.

Java port of Mozilla&#39;s automatic charset detection algorithm. See... [http://www.mozilla.org/projects/intl/chardet.html](http://www.mozilla.org/projects/intl/chardet.html)for the details of the orginal code and Author.


**License**
 [Mozilla Public License 1.1 (MPL 1.1)](https://sourceforge.net/directory/license:mpl11/)

Follow Java port of Mozilla charset detector
[Java port of Mozilla charset detector Web Site](http://jchardet.sourceforge.net/)

## note
I did three things in this repo :
* import source from https://sourceforge.net/projects/jchardet/
* convert the cvs repository to Git 
* convert project from Ant to Maven

## how to use

1. compile & package 
maven:
```shell
mvn clean install
```
2. import dependency

```xml
<dependency>
  <groupId>org.mozilla.intl</groupId>
  <artifactId>jcharset</artifactId>
  <version>1.0.0</version>
</dependency>
```


