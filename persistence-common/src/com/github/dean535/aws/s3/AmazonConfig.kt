package com.github.dean535.aws.s3


import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.regions.Regions
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(_root_ide_package_.com.github.dean535.aws.s3.AmazonProperties::class)
class AmazonConfig {

    @Autowired
    private val amazonProperties: _root_ide_package_.com.github.dean535.aws.s3.AmazonProperties? = null

    @Bean
    fun createAmazonS3Client(): AmazonS3 {
        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(
                        AWSStaticCredentialsProvider(
                                BasicAWSCredentials(amazonProperties!!.accessKey, amazonProperties.secretKey)
                        )
                ).withRegion(Regions.AP_SOUTHEAST_2).build()
    }
}
