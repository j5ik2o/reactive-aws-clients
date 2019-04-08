// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConfirmProductInstanceRequestBuilderOps(val self: ConfirmProductInstanceRequest.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): ConfirmProductInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def productCodeAsScala(value: Option[String]): ConfirmProductInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.productCode(v)
    }
  }

}

final class ConfirmProductInstanceRequestOps(val self: ConfirmProductInstanceRequest) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def productCodeAsScala: Option[String] = Option(self.productCode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConfirmProductInstanceRequestOps {

  implicit def toConfirmProductInstanceRequestBuilderOps(
      v: ConfirmProductInstanceRequest.Builder
  ): ConfirmProductInstanceRequestBuilderOps = new ConfirmProductInstanceRequestBuilderOps(v)

  implicit def toConfirmProductInstanceRequestOps(v: ConfirmProductInstanceRequest): ConfirmProductInstanceRequestOps =
    new ConfirmProductInstanceRequestOps(v)

}
