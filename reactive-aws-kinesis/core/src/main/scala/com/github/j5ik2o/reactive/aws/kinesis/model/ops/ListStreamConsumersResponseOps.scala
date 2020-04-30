// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListStreamConsumersResponseBuilderOps(val self: ListStreamConsumersResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def consumersAsScala(value: Option[Seq[Consumer]]): ListStreamConsumersResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.consumers(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): ListStreamConsumersResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class ListStreamConsumersResponseOps(val self: ListStreamConsumersResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def consumersAsScala: Option[Seq[Consumer]] = Option(self.consumers).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamConsumersResponseOps {

implicit def toListStreamConsumersResponseBuilderOps(v: ListStreamConsumersResponse.Builder): ListStreamConsumersResponseBuilderOps = new ListStreamConsumersResponseBuilderOps(v)

implicit def toListStreamConsumersResponseOps(v: ListStreamConsumersResponse): ListStreamConsumersResponseOps = new ListStreamConsumersResponseOps(v)

}

