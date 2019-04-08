// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AdvancedOptionsStatusBuilderOps(val self: AdvancedOptionsStatus.Builder) extends AnyVal {

  final def optionsAsScala(value: Option[Map[String, String]]): AdvancedOptionsStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.options(v.asJava)
    } // Map[String, String]
  }

  final def statusAsScala(value: Option[OptionStatus]): AdvancedOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class AdvancedOptionsStatusOps(val self: AdvancedOptionsStatus) extends AnyVal {

  final def optionsAsScala: Option[Map[String, String]] = Option(self.options).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdvancedOptionsStatusOps {

  implicit def toAdvancedOptionsStatusBuilderOps(v: AdvancedOptionsStatus.Builder): AdvancedOptionsStatusBuilderOps =
    new AdvancedOptionsStatusBuilderOps(v)

  implicit def toAdvancedOptionsStatusOps(v: AdvancedOptionsStatus): AdvancedOptionsStatusOps =
    new AdvancedOptionsStatusOps(v)

}
