// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ TargetGrant => ScalaTargetGrant, _ }
import software.amazon.awssdk.services.s3.model.{ TargetGrant => JavaTargetGrant }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TargetGrantOps {

  implicit class ScalaTargetGrantOps(val self: ScalaTargetGrant) extends AnyVal {

    def toJava: JavaTargetGrant = {
      val result = JavaTargetGrant.builder()
      self.grantee.foreach { v =>
        import GranteeOps._; result.grantee(v.toJava)
      } // Grantee
      self.permission.foreach { v =>
        import BucketLogsPermissionOps._; result.permission(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaTargetGrantOps(val self: JavaTargetGrant) extends AnyVal {

    def toScala: ScalaTargetGrant = {
      ScalaTargetGrant()
        .withGrantee(Option(self.grantee).map { v =>
          import GranteeOps._; v.toScala
        }) // Grantee
        .withPermission(Option(self.permission).map { v =>
          import BucketLogsPermissionOps._; v.toScala
        }) // String
    }

  }

}
