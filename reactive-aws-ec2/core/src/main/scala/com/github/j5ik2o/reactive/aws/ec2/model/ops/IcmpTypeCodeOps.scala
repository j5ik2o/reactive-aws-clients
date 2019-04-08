// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IcmpTypeCodeBuilderOps(val self: IcmpTypeCode.Builder) extends AnyVal {

  final def codeAsScala(value: Option[Int]): IcmpTypeCode.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def typeAsScala(value: Option[Int]): IcmpTypeCode.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class IcmpTypeCodeOps(val self: IcmpTypeCode) extends AnyVal {

  final def codeAsScala: Option[Int] = Option(self.code)

  final def typeAsScala: Option[Int] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIcmpTypeCodeOps {

  implicit def toIcmpTypeCodeBuilderOps(v: IcmpTypeCode.Builder): IcmpTypeCodeBuilderOps = new IcmpTypeCodeBuilderOps(v)

  implicit def toIcmpTypeCodeOps(v: IcmpTypeCode): IcmpTypeCodeOps = new IcmpTypeCodeOps(v)

}
