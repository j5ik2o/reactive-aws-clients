// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class AddTagsToStreamRequestBuilderOps(val self: AddTagsToStreamRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala(value: Option[String]): AddTagsToStreamRequest.Builder = {
            value.fold(self){ v => self.streamName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Map[String, String]]): AddTagsToStreamRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class AddTagsToStreamRequestOps(val self: AddTagsToStreamRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala: Option[String] = Option(self.streamName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Map[String, String]]  = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddTagsToStreamRequestOps {

implicit def toAddTagsToStreamRequestBuilderOps(v: AddTagsToStreamRequest.Builder): AddTagsToStreamRequestBuilderOps = new AddTagsToStreamRequestBuilderOps(v)

implicit def toAddTagsToStreamRequestOps(v: AddTagsToStreamRequest): AddTagsToStreamRequestOps = new AddTagsToStreamRequestOps(v)

}

