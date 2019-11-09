// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteQueuedReservedInstancesErrorBuilderOps(val self: DeleteQueuedReservedInstancesError.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(
      value: Option[DeleteQueuedReservedInstancesErrorCode]
  ): DeleteQueuedReservedInstancesError.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): DeleteQueuedReservedInstancesError.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class DeleteQueuedReservedInstancesErrorOps(val self: DeleteQueuedReservedInstancesError) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[DeleteQueuedReservedInstancesErrorCode] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteQueuedReservedInstancesErrorOps {

  implicit def toDeleteQueuedReservedInstancesErrorBuilderOps(
      v: DeleteQueuedReservedInstancesError.Builder
  ): DeleteQueuedReservedInstancesErrorBuilderOps = new DeleteQueuedReservedInstancesErrorBuilderOps(v)

  implicit def toDeleteQueuedReservedInstancesErrorOps(
      v: DeleteQueuedReservedInstancesError
  ): DeleteQueuedReservedInstancesErrorOps = new DeleteQueuedReservedInstancesErrorOps(v)

}
