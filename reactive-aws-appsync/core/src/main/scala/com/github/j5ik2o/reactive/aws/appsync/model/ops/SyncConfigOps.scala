// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class SyncConfigBuilderOps(val self: SyncConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conflictHandlerAsScala(value: Option[ConflictHandlerType]): SyncConfig.Builder = {
    value.fold(self) { v => self.conflictHandler(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conflictDetectionAsScala(value: Option[ConflictDetectionType]): SyncConfig.Builder = {
    value.fold(self) { v => self.conflictDetection(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaConflictHandlerConfigAsScala(value: Option[LambdaConflictHandlerConfig]): SyncConfig.Builder = {
    value.fold(self) { v => self.lambdaConflictHandlerConfig(v) }
  }

}

final class SyncConfigOps(val self: SyncConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conflictHandlerAsScala: Option[ConflictHandlerType] = Option(self.conflictHandler)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conflictDetectionAsScala: Option[ConflictDetectionType] = Option(self.conflictDetection)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaConflictHandlerConfigAsScala: Option[LambdaConflictHandlerConfig] =
    Option(self.lambdaConflictHandlerConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSyncConfigOps {

  implicit def toSyncConfigBuilderOps(v: SyncConfig.Builder): SyncConfigBuilderOps = new SyncConfigBuilderOps(v)

  implicit def toSyncConfigOps(v: SyncConfig): SyncConfigOps = new SyncConfigOps(v)

}
