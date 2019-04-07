// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class EBSOptionsStatusBuilderOps(val self: EBSOptionsStatus.Builder) extends AnyVal {

  final def withOptionsAsScala(value: Option[EBSOptions]): EBSOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // EBSOptions

  final def withStatusAsScala(value: Option[OptionStatus]): EBSOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class EBSOptionsStatusOps(val self: EBSOptionsStatus) extends AnyVal {

  final def optionsAsScala: Option[EBSOptions] = Option(self.options) // EBSOptions

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEBSOptionsStatusOps {

  implicit def toEBSOptionsStatusBuilderOps(v: EBSOptionsStatus.Builder): EBSOptionsStatusBuilderOps =
    new EBSOptionsStatusBuilderOps(v)

  implicit def toEBSOptionsStatusOps(v: EBSOptionsStatus): EBSOptionsStatusOps = new EBSOptionsStatusOps(v)

}
