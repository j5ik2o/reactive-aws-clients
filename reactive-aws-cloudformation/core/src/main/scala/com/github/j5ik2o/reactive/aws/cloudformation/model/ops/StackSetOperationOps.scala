// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetOperationBuilderOps(val self: StackSetOperation.Builder) extends AnyVal {

  final def operationIdAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  } // String

  final def stackSetIdAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  } // String

  final def actionAsScala(value: Option[StackSetOperationAction]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  } // StackSetOperationAction

  final def statusAsScala(value: Option[StackSetOperationStatus]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // StackSetOperationStatus

  final def operationPreferencesAsScala(value: Option[StackSetOperationPreferences]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.operationPreferences(v)
    }
  } // StackSetOperationPreferences

  final def retainStacksAsScala(value: Option[Boolean]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.retainStacks(v)
    }
  } // Boolean

  final def administrationRoleARNAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  } // String

  final def executionRoleNameAsScala(value: Option[String]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  } // String

  final def creationTimestampAsScala(value: Option[java.time.Instant]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.creationTimestamp(v)
    }
  } // java.time.Instant

  final def endTimestampAsScala(value: Option[java.time.Instant]): StackSetOperation.Builder = {
    value.fold(self) { v =>
      self.endTimestamp(v)
    }
  } // java.time.Instant

}

final class StackSetOperationOps(val self: StackSetOperation) extends AnyVal {

  final def operationIdAsScala: Option[String] = Option(self.operationId) // String

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId) // String

  final def actionAsScala: Option[StackSetOperationAction] = Option(self.action) // StackSetOperationAction

  final def statusAsScala: Option[StackSetOperationStatus] = Option(self.status) // StackSetOperationStatus

  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] =
    Option(self.operationPreferences) // StackSetOperationPreferences

  final def retainStacksAsScala: Option[Boolean] = Option(self.retainStacks) // Boolean

  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN) // String

  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName) // String

  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp) // java.time.Instant

  final def endTimestampAsScala: Option[java.time.Instant] = Option(self.endTimestamp) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOperationOps {

  implicit def toStackSetOperationBuilderOps(v: StackSetOperation.Builder): StackSetOperationBuilderOps =
    new StackSetOperationBuilderOps(v)

  implicit def toStackSetOperationOps(v: StackSetOperation): StackSetOperationOps = new StackSetOperationOps(v)

}
