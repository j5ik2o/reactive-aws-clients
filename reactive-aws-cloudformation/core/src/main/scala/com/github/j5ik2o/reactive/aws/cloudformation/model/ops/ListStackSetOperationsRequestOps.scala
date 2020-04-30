// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackSetOperationsRequestBuilderOps(val self: ListStackSetOperationsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetNameAsScala(value: Option[String]): ListStackSetOperationsRequest.Builder = {
            value.fold(self){ v => self.stackSetName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): ListStackSetOperationsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): ListStackSetOperationsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 


}

final class ListStackSetOperationsRequestOps(val self: ListStackSetOperationsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackSetOperationsRequestOps {

implicit def toListStackSetOperationsRequestBuilderOps(v: ListStackSetOperationsRequest.Builder): ListStackSetOperationsRequestBuilderOps = new ListStackSetOperationsRequestBuilderOps(v)

implicit def toListStackSetOperationsRequestOps(v: ListStackSetOperationsRequest): ListStackSetOperationsRequestOps = new ListStackSetOperationsRequestOps(v)

}

