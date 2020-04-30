// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeTaskSetsResponseBuilderOps(val self: DescribeTaskSetsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def taskSetsAsScala(value: Option[Seq[TaskSet]]): DescribeTaskSetsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.taskSets(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failuresAsScala(value: Option[Seq[Failure]]): DescribeTaskSetsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava) } 
            }


}

final class DescribeTaskSetsResponseOps(val self: DescribeTaskSetsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def taskSetsAsScala: Option[Seq[TaskSet]] = Option(self.taskSets).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTaskSetsResponseOps {

implicit def toDescribeTaskSetsResponseBuilderOps(v: DescribeTaskSetsResponse.Builder): DescribeTaskSetsResponseBuilderOps = new DescribeTaskSetsResponseBuilderOps(v)

implicit def toDescribeTaskSetsResponseOps(v: DescribeTaskSetsResponse): DescribeTaskSetsResponseOps = new DescribeTaskSetsResponseOps(v)

}

