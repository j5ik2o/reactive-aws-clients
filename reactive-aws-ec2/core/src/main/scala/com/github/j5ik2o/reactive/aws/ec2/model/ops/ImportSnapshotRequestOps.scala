// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportSnapshotRequestBuilderOps(val self: ImportSnapshotRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientDataAsScala(value: Option[ClientData]): ImportSnapshotRequest.Builder = {
            value.fold(self){ v => self.clientData(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): ImportSnapshotRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): ImportSnapshotRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def diskContainerAsScala(value: Option[SnapshotDiskContainer]): ImportSnapshotRequest.Builder = {
            value.fold(self){ v => self.diskContainer(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptedAsScala(value: Option[Boolean]): ImportSnapshotRequest.Builder = {
            value.fold(self){ v => self.encrypted(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala(value: Option[String]): ImportSnapshotRequest.Builder = {
            value.fold(self){ v => self.kmsKeyId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def roleNameAsScala(value: Option[String]): ImportSnapshotRequest.Builder = {
            value.fold(self){ v => self.roleName(v) }
            } 


}

final class ImportSnapshotRequestOps(val self: ImportSnapshotRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientDataAsScala: Option[ClientData] = Option(self.clientData) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def diskContainerAsScala: Option[SnapshotDiskContainer] = Option(self.diskContainer) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptedAsScala: Option[Boolean] = Option(self.encrypted) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def roleNameAsScala: Option[String] = Option(self.roleName) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportSnapshotRequestOps {

implicit def toImportSnapshotRequestBuilderOps(v: ImportSnapshotRequest.Builder): ImportSnapshotRequestBuilderOps = new ImportSnapshotRequestBuilderOps(v)

implicit def toImportSnapshotRequestOps(v: ImportSnapshotRequest): ImportSnapshotRequestOps = new ImportSnapshotRequestOps(v)

}

