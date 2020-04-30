// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsAndOperatorBuilderOps(val self: AnalyticsAndOperator.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala(value: Option[String]): AnalyticsAndOperator.Builder = {
            value.fold(self){ v => self.prefix(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): AnalyticsAndOperator.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class AnalyticsAndOperatorOps(val self: AnalyticsAndOperator) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala: Option[String] = Option(self.prefix) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsAndOperatorOps {

implicit def toAnalyticsAndOperatorBuilderOps(v: AnalyticsAndOperator.Builder): AnalyticsAndOperatorBuilderOps = new AnalyticsAndOperatorBuilderOps(v)

implicit def toAnalyticsAndOperatorOps(v: AnalyticsAndOperator): AnalyticsAndOperatorOps = new AnalyticsAndOperatorOps(v)

}

