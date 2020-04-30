// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompletedMultipartUploadBuilderOps(val self: CompletedMultipartUpload.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def partsAsScala(value: Option[Seq[CompletedPart]]): CompletedMultipartUpload.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parts(v.asJava) } 
            }


}

final class CompletedMultipartUploadOps(val self: CompletedMultipartUpload) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def partsAsScala: Option[Seq[CompletedPart]] = Option(self.parts).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompletedMultipartUploadOps {

implicit def toCompletedMultipartUploadBuilderOps(v: CompletedMultipartUpload.Builder): CompletedMultipartUploadBuilderOps = new CompletedMultipartUploadBuilderOps(v)

implicit def toCompletedMultipartUploadOps(v: CompletedMultipartUpload): CompletedMultipartUploadOps = new CompletedMultipartUploadOps(v)

}

