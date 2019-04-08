// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ChangeBuilderOps(val self: Change.Builder) extends AnyVal {

  final def typeAsScala(value: Option[ChangeType]): Change.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def resourceChangeAsScala(value: Option[ResourceChange]): Change.Builder = {
    value.fold(self) { v =>
      self.resourceChange(v)
    }
  }

}

final class ChangeOps(val self: Change) extends AnyVal {

  final def typeAsScala: Option[ChangeType] = Option(self.`type`)

  final def resourceChangeAsScala: Option[ResourceChange] = Option(self.resourceChange)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeOps {

  implicit def toChangeBuilderOps(v: Change.Builder): ChangeBuilderOps = new ChangeBuilderOps(v)

  implicit def toChangeOps(v: Change): ChangeOps = new ChangeOps(v)

}
