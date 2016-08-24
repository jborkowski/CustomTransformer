name := "custom.tranformer"

organization := "pl.scalajacekworkshop"

version := "1.0.0"

scalaVersion := "2.11.8"

val scalatestV = "3.0.0-RC4"
libraryDependencies += "org.scalactic" %% "scalactic" % scalatestV
libraryDependencies += "org.scalatest" %% "scalatest" % scalatestV % "test"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.0.0"
//test
//1s += Resolver.mavenLocal
//resolvers += "Spark 2.0.0 RC2" at "https://repository.apache.org/content/repositories/orgapachespark-1189"
////libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0"s
//
////spName := s"${organization.value}/${name.value}"
//sparkVersion := "2.0.0"
//sparkComponents := Seq("core", "sql", "ml")
//
//publishMavenStyle := true
    