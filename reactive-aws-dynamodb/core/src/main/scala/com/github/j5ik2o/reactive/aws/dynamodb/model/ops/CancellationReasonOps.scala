// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CancellationReasonBuilderOps(val self: CancellationReason.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def itemAsScala(value: Option[Map[String, AttributeValue]]): CancellationReason.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.item(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[String]): CancellationReason.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): CancellationReason.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class CancellationReasonOps(val self: CancellationReason) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def itemAsScala: Option[Map[String, AttributeValue]]  = Option(self.item).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[String] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancellationReasonOps {

implicit def toCancellationReasonBuilderOps(v: CancellationReason.Builder): CancellationReasonBuilderOps = new CancellationReasonBuilderOps(v)

implicit def toCancellationReasonOps(v: CancellationReason): CancellationReasonOps = new CancellationReasonOps(v)

}

