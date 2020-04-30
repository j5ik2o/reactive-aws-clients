// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableFastSnapshotRestoreStateErrorBuilderOps(val self: DisableFastSnapshotRestoreStateError.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[String]): DisableFastSnapshotRestoreStateError.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): DisableFastSnapshotRestoreStateError.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class DisableFastSnapshotRestoreStateErrorOps(val self: DisableFastSnapshotRestoreStateError) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[String] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableFastSnapshotRestoreStateErrorOps {

implicit def toDisableFastSnapshotRestoreStateErrorBuilderOps(v: DisableFastSnapshotRestoreStateError.Builder): DisableFastSnapshotRestoreStateErrorBuilderOps = new DisableFastSnapshotRestoreStateErrorBuilderOps(v)

implicit def toDisableFastSnapshotRestoreStateErrorOps(v: DisableFastSnapshotRestoreStateError): DisableFastSnapshotRestoreStateErrorOps = new DisableFastSnapshotRestoreStateErrorOps(v)

}

