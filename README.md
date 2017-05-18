scala-aws-lambda-seed,g8
=========================

This is a seed project to create AWS Lambdas in Sala

## To create a new project run

```
sbt new yeghishe/scala-aws-lambda-seed.g8
```

## Overview

Once the project is generated you get few things out of the box:
* [Config](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Config.scala) is handled using [Ficus](https://github.com/ceedubs/ficus). Make sure to create your case classes for new config values you add in typesafe config. You can later mix in `Config` trait or import your values from `Config` object.
* [Scalafmt](https://github.com/olafurpg/scalafmt) is being used for code formatting.
* [Scalastyle](http://www.scalastyle.org/) is being used fro code style checking.
* [Scoverage](https://github.com/scoverage/sbt-scoverage) is being used for code coverage .
* [Sbt Assembly](https://github.com/sbt/sbt-assembly) is being used for packaging.
* [Sbt S3](https://github.com/sbt/sbt-s3) is being used for deployment to S3.
