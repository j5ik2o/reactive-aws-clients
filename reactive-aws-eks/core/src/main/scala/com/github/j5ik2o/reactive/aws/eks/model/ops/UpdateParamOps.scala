// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateParamBuilderOps(val self: UpdateParam.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[UpdateParamType]): UpdateParam.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): UpdateParam.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class UpdateParamOps(val self: UpdateParam) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[UpdateParamType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateParamOps {

  implicit def toUpdateParamBuilderOps(v: UpdateParam.Builder): UpdateParamBuilderOps = new UpdateParamBuilderOps(v)

  implicit def toUpdateParamOps(v: UpdateParam): UpdateParamOps = new UpdateParamOps(v)

}
