// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetOperationBuilderOps(val self: StackSetOperation.Builder) extends AnyVal {

  final def operationIdAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  }

  final def stackSetIdAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  }

  final def actionAsScala(value: Option[StackSetOperationAction]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  }

  final def statusAsScala(value: Option[StackSetOperationStatus]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def operationPreferencesAsScala(value: Option[StackSetOperationPreferences]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.operationPreferences(v)
    }
  }

  final def retainStacksAsScala(value: Option[Boolean]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.retainStacks(v)
    }
  }

  final def administrationRoleARNAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  }

  final def executionRoleNameAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  }

  final def creationTimestampAsScala(value: Option[java.time.Instant]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.creationTimestamp(v)
    }
  }

  final def endTimestampAsScala(value: Option[java.time.Instant]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.endTimestamp(v)
    }
  }

}

final class StackSetOperationOps(val self: StackSetOperation) extends AnyVal {

  final def operationIdAsScala: Option[String] = Option(self.operationId)

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

  final def actionAsScala: Option[StackSetOperationAction] = Option(self.action)

  final def statusAsScala: Option[StackSetOperationStatus] = Option(self.status)

  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] = Option(self.operationPreferences)

  final def retainStacksAsScala: Option[Boolean] = Option(self.retainStacks)

  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN)

  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName)

  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

  final def endTimestampAsScala: Option[java.time.Instant] = Option(self.endTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOperationOps {

  implicit def toStackSetOperationBuilderOps(v: StackSetOperation.Builder): StackSetOperationBuilderOps =
    new StackSetOperationBuilderOps(v)

  implicit def toStackSetOperationOps(v: StackSetOperation): StackSetOperationOps = new StackSetOperationOps(v)

}
