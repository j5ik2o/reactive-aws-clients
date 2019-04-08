// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectLockRuleBuilderOps(val self: ObjectLockRule.Builder) extends AnyVal {

  final def defaultRetentionAsScala(value: Option[DefaultRetention]): ObjectLockRule.Builder = {
    value.fold(self) { v =>
      self.defaultRetention(v)
    }
  } // DefaultRetention

}

final class ObjectLockRuleOps(val self: ObjectLockRule) extends AnyVal {

  final def defaultRetentionAsScala: Option[DefaultRetention] = Option(self.defaultRetention) // DefaultRetention

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectLockRuleOps {

  implicit def toObjectLockRuleBuilderOps(v: ObjectLockRule.Builder): ObjectLockRuleBuilderOps =
    new ObjectLockRuleBuilderOps(v)

  implicit def toObjectLockRuleOps(v: ObjectLockRule): ObjectLockRuleOps = new ObjectLockRuleOps(v)

}
