// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class EBSOptionsStatusBuilderOps(val self: EBSOptionsStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[EBSOptions]): EBSOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): EBSOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class EBSOptionsStatusOps(val self: EBSOptionsStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[EBSOptions] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEBSOptionsStatusOps {

  implicit def toEBSOptionsStatusBuilderOps(v: EBSOptionsStatus.Builder): EBSOptionsStatusBuilderOps =
    new EBSOptionsStatusBuilderOps(v)

  implicit def toEBSOptionsStatusOps(v: EBSOptionsStatus): EBSOptionsStatusOps = new EBSOptionsStatusOps(v)

}
