name := "root"

version := "0.0.0-SNAPSHOT"

lazy val root = project.in(file("."))
  .aggregate(common, core, cli, web)

lazy val common = project

lazy val core = project
  .dependsOn(common)

lazy val cli = project
  .dependsOn(common, core)
  
lazy val web = project
  .settings(play.Project.playScalaSettings: _*)
  .dependsOn(common, core)