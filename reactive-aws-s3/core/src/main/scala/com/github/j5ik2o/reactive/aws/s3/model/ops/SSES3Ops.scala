// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class SSES3BuilderOps(val self: SSES3.Builder) extends AnyVal {}

final class SSES3Ops(val self: SSES3) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSES3Ops {

  implicit def toSSES3BuilderOps(v: SSES3.Builder): SSES3BuilderOps = new SSES3BuilderOps(v)

  implicit def toSSES3Ops(v: SSES3): SSES3Ops = new SSES3Ops(v)

}
