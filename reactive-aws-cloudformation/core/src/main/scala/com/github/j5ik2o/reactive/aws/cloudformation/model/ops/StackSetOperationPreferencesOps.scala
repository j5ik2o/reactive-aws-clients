// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetOperationPreferencesBuilderOps(val self: StackSetOperationPreferences.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionOrderAsScala(value: Option[Seq[String]]): StackSetOperationPreferences.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.regionOrder(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failureToleranceCountAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
            value.fold(self){ v => self.failureToleranceCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failureTolerancePercentageAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
            value.fold(self){ v => self.failureTolerancePercentage(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxConcurrentCountAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
            value.fold(self){ v => self.maxConcurrentCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxConcurrentPercentageAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
            value.fold(self){ v => self.maxConcurrentPercentage(v) }
            } 


}

final class StackSetOperationPreferencesOps(val self: StackSetOperationPreferences) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def regionOrderAsScala: Option[Seq[String]] = Option(self.regionOrder).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failureToleranceCountAsScala: Option[Int] = Option(self.failureToleranceCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failureTolerancePercentageAsScala: Option[Int] = Option(self.failureTolerancePercentage) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxConcurrentCountAsScala: Option[Int] = Option(self.maxConcurrentCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxConcurrentPercentageAsScala: Option[Int] = Option(self.maxConcurrentPercentage) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOperationPreferencesOps {

implicit def toStackSetOperationPreferencesBuilderOps(v: StackSetOperationPreferences.Builder): StackSetOperationPreferencesBuilderOps = new StackSetOperationPreferencesBuilderOps(v)

implicit def toStackSetOperationPreferencesOps(v: StackSetOperationPreferences): StackSetOperationPreferencesOps = new StackSetOperationPreferencesOps(v)

}

