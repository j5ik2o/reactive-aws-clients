// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TargetGrantBuilderOps(val self: TargetGrant.Builder) extends AnyVal {

  final def withGranteeAsScala(value: Option[Grantee]): TargetGrant.Builder = {
    value.fold(self) { v =>
      self.grantee(v)
    }
  } // Grantee

  final def withPermissionAsScala(value: Option[BucketLogsPermission]): TargetGrant.Builder = {
    value.fold(self) { v =>
      self.permission(v)
    }
  } // String

}

final class TargetGrantOps(val self: TargetGrant) extends AnyVal {

  final def granteeAsScala: Option[Grantee] = Option(self.grantee) // Grantee

  final def permissionAsScala: Option[BucketLogsPermission] = Option(self.permission) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetGrantOps {

  implicit def toTargetGrantBuilderOps(v: TargetGrant.Builder): TargetGrantBuilderOps = new TargetGrantBuilderOps(v)

  implicit def toTargetGrantOps(v: TargetGrant): TargetGrantOps = new TargetGrantOps(v)

}
