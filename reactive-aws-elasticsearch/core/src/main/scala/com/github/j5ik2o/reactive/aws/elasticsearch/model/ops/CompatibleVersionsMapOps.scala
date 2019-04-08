// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CompatibleVersionsMapBuilderOps(val self: CompatibleVersionsMap.Builder) extends AnyVal {

  final def sourceVersionAsScala(value: Option[String]): CompatibleVersionsMap.Builder = {
    value.fold(self) { v =>
      self.sourceVersion(v)
    }
  } // String

  final def targetVersionsAsScala(value: Option[Seq[String]]): CompatibleVersionsMap.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.targetVersions(v.asJava)
    } // Seq[String]
  }

}

final class CompatibleVersionsMapOps(val self: CompatibleVersionsMap) extends AnyVal {

  final def sourceVersionAsScala: Option[String] = Option(self.sourceVersion) // String

  final def targetVersionsAsScala: Option[Seq[String]] = Option(self.targetVersions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompatibleVersionsMapOps {

  implicit def toCompatibleVersionsMapBuilderOps(v: CompatibleVersionsMap.Builder): CompatibleVersionsMapBuilderOps =
    new CompatibleVersionsMapBuilderOps(v)

  implicit def toCompatibleVersionsMapOps(v: CompatibleVersionsMap): CompatibleVersionsMapOps =
    new CompatibleVersionsMapOps(v)

}
