// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeBundleTasksResponseBuilderOps(val self: DescribeBundleTasksResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleTasksAsScala(value: Option[Seq[BundleTask]]): DescribeBundleTasksResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.bundleTasks(v.asJava) } 
            }


}

final class DescribeBundleTasksResponseOps(val self: DescribeBundleTasksResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def bundleTasksAsScala: Option[Seq[BundleTask]] = Option(self.bundleTasks).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeBundleTasksResponseOps {

implicit def toDescribeBundleTasksResponseBuilderOps(v: DescribeBundleTasksResponse.Builder): DescribeBundleTasksResponseBuilderOps = new DescribeBundleTasksResponseBuilderOps(v)

implicit def toDescribeBundleTasksResponseOps(v: DescribeBundleTasksResponse): DescribeBundleTasksResponseOps = new DescribeBundleTasksResponseOps(v)

}

