// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TargetGrantBuilderOps(val self: TargetGrant.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteeAsScala(value: Option[Grantee]): TargetGrant.Builder = {
    value.fold(self) { v => self.grantee(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionAsScala(value: Option[BucketLogsPermission]): TargetGrant.Builder = {
    value.fold(self) { v => self.permission(v) }
  }

}

final class TargetGrantOps(val self: TargetGrant) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteeAsScala: Option[Grantee] = Option(self.grantee)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionAsScala: Option[BucketLogsPermission] = Option(self.permission)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetGrantOps {

  implicit def toTargetGrantBuilderOps(v: TargetGrant.Builder): TargetGrantBuilderOps = new TargetGrantBuilderOps(v)

  implicit def toTargetGrantOps(v: TargetGrant): TargetGrantOps = new TargetGrantOps(v)

}
