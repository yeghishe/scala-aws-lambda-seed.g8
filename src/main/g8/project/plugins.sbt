resolvers += Classpaths.sbtPluginReleases
resolvers += Resolver.url("sbts3 ivy resolver", url("http://dl.bintray.com/emersonloureiro/sbt-plugins"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.3.0")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")
addSbtPlugin("cf.janga" % "sbts3" % "0.10")
