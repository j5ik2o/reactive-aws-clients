// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ConditionBuilderOps(val self: Condition.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpErrorCodeReturnedEqualsAsScala(value: Option[String]): Condition.Builder = {
    value.fold(self) { v => self.httpErrorCodeReturnedEquals(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPrefixEqualsAsScala(value: Option[String]): Condition.Builder = {
    value.fold(self) { v => self.keyPrefixEquals(v) }
  }

}

final class ConditionOps(val self: Condition) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpErrorCodeReturnedEqualsAsScala: Option[String] = Option(self.httpErrorCodeReturnedEquals)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPrefixEqualsAsScala: Option[String] = Option(self.keyPrefixEquals)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConditionOps {

  implicit def toConditionBuilderOps(v: Condition.Builder): ConditionBuilderOps = new ConditionBuilderOps(v)

  implicit def toConditionOps(v: Condition): ConditionOps = new ConditionOps(v)

}
