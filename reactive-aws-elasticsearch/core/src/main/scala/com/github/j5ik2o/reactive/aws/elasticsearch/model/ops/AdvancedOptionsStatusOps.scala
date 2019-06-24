// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AdvancedOptionsStatusBuilderOps(val self: AdvancedOptionsStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[Map[String, String]]): AdvancedOptionsStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.options(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): AdvancedOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class AdvancedOptionsStatusOps(val self: AdvancedOptionsStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[Map[String, String]] = Option(self.options).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdvancedOptionsStatusOps {

  implicit def toAdvancedOptionsStatusBuilderOps(v: AdvancedOptionsStatus.Builder): AdvancedOptionsStatusBuilderOps =
    new AdvancedOptionsStatusBuilderOps(v)

  implicit def toAdvancedOptionsStatusOps(v: AdvancedOptionsStatus): AdvancedOptionsStatusOps =
    new AdvancedOptionsStatusOps(v)

}
