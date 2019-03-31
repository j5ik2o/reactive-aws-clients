// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Grant => ScalaGrant, _ }
import software.amazon.awssdk.services.s3.model.{ Grant => JavaGrant }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GrantOps {

  implicit class ScalaGrantOps(val self: ScalaGrant) extends AnyVal {

    def toJava: JavaGrant = {
      val result = JavaGrant.builder()
      self.grantee.foreach { v =>
        import GranteeOps._; result.grantee(v.toJava)
      } // Grantee
      self.permission.foreach { v =>
        import PermissionOps._; result.permission(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaGrantOps(val self: JavaGrant) extends AnyVal {

    def toScala: ScalaGrant = {
      ScalaGrant()
        .withGrantee(Option(self.grantee).map { v =>
          import GranteeOps._; v.toScala
        }) // Grantee
        .withPermission(Option(self.permission).map { v =>
          import PermissionOps._; v.toScala
        }) // String
    }

  }

}
