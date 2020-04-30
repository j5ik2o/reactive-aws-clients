// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePrincipalIdFormatRequestBuilderOps(val self: DescribePrincipalIdFormatRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourcesAsScala(value: Option[Seq[String]]): DescribePrincipalIdFormatRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resources(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribePrincipalIdFormatRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribePrincipalIdFormatRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribePrincipalIdFormatRequestOps(val self: DescribePrincipalIdFormatRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def resourcesAsScala: Option[Seq[String]] = Option(self.resources).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePrincipalIdFormatRequestOps {

implicit def toDescribePrincipalIdFormatRequestBuilderOps(v: DescribePrincipalIdFormatRequest.Builder): DescribePrincipalIdFormatRequestBuilderOps = new DescribePrincipalIdFormatRequestBuilderOps(v)

implicit def toDescribePrincipalIdFormatRequestOps(v: DescribePrincipalIdFormatRequest): DescribePrincipalIdFormatRequestOps = new DescribePrincipalIdFormatRequestOps(v)

}

