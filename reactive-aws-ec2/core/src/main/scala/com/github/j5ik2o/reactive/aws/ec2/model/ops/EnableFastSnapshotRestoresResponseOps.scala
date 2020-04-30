// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableFastSnapshotRestoresResponseBuilderOps(val self: EnableFastSnapshotRestoresResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def successfulAsScala(value: Option[Seq[EnableFastSnapshotRestoreSuccessItem]]): EnableFastSnapshotRestoresResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successful(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def unsuccessfulAsScala(value: Option[Seq[EnableFastSnapshotRestoreErrorItem]]): EnableFastSnapshotRestoresResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava) } 
            }


}

final class EnableFastSnapshotRestoresResponseOps(val self: EnableFastSnapshotRestoresResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def successfulAsScala: Option[Seq[EnableFastSnapshotRestoreSuccessItem]] = Option(self.successful).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def unsuccessfulAsScala: Option[Seq[EnableFastSnapshotRestoreErrorItem]] = Option(self.unsuccessful).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableFastSnapshotRestoresResponseOps {

implicit def toEnableFastSnapshotRestoresResponseBuilderOps(v: EnableFastSnapshotRestoresResponse.Builder): EnableFastSnapshotRestoresResponseBuilderOps = new EnableFastSnapshotRestoresResponseBuilderOps(v)

implicit def toEnableFastSnapshotRestoresResponseOps(v: EnableFastSnapshotRestoresResponse): EnableFastSnapshotRestoresResponseOps = new EnableFastSnapshotRestoresResponseOps(v)

}

