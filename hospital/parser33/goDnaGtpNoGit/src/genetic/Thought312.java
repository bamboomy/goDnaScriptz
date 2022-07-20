package genetic;
import java.util.ArrayList;
class Thought312 extends Thought{
private static ArrayList<Thought312> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 400.23648714727585;
private double fd1 = 706.3014403304976;
private Thought fo0 = null;
private Thought fo1 = null;
Thought312 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought312 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought312 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought312 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought312 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought312 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought312 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought312 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought312 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought312 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought312 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought312 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought312 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought312 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought312 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought312 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought312 instance = new Thought312 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[3][2] += fd1;
    double ld0 = 116.03468206921224;
    fb1 = !fb0;
    ld0 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb1 = true;
        if (lb1) {
            ld0 *= -1;
            double ld2 = 683.6747658491519;
if(fo1 != null){
              ld0 = fo1.m3(fb0, fb1, lb1, fb0);
}
            Thought lo3 = Thought341.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld0, fb1, lb1, fb0, fb1);
            fd0 = fd1 - ld2;
if(fo1 != null){
              fo0 = fo1.m4(ld0, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[3][3] += fd1;
    fb1 = fd0 < fd1;
    if (ab1) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        ab2 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        ab3 = ab4 && fb0;
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
        fd0 *= -1;
        double ld1 = 680.103863769807;
        Thought lo2 = Thought132.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo3 = Thought128.getInstance(fd0, fd1, ld1, fd0);
        lb0 = !ab1;
        boolean lb4 = true;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 143.35436330060926;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    double ld2 = 908.1643147156021;
    double ld3 = 789.7306106639476;
    lb1 = ad3 < ad4;
    fd0 = fd1 - ld0;
    Thought lo4 = Thought81.getInstance(fb0, fb1, lb1, fb0);
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought296.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2, fb1, lb1, fb0, fb1);
        lb1 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
        ld3 = ad1 - ad2;
        double ld6 = 547.2292572467339;
        ad2 = ad3 + ad4;
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        for(int i1=0; i1<10; i1++){
            double ld7 = 88.9838893861785;
            fb0 = !fb1;
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ld7);
}
            boolean lb8 = true;
            Thought lo9 = Thought5.getInstance(fo0, fo1, fo0, fo1, ld6, ld0, ld2, ld3);
if(fo1 != null){
              fo0 = fo1.m4();
}
            ad1 *= -1;
            lb8 = lb1 && fb0;
            Output.points[3][4] += ad2;
            if (fb1) {
}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ad1 *= -1;
        double ld0 = 747.624174566741;
        ab4 = fb0 && fb1;
        Output.points[3][5] -= ad1;
        for(int i1=0; i1<10; i1++){
            double ld1 = 628.1473999502156;
if(fo1 != null){
              ab1 = fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
              ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              fd0 = fo1.m3(fd1, ld1, ld0, ad1);
}
            double ld2 = 861.6138650398983;
            fb0 = !fb1;
            boolean lb3 = true;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
            for(int i2=0; i2<10; i2++){
                fd0 *= -1;
}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought18.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fb1 = !fb0;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3();
}
if(ao4 != null){
      ao4.m2(lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
    if (fb0) {
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        lb0 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
        ad3 = ad4 - fd0;
        boolean lb1 = false;
        lb0 = fd1 > ad1;
if(ao4 != null){
          lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        Output.points[3][6] += fd1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    double ld0 = 153.5839891579471;
    ld0 = fd0 - fd1;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, ad1, ad2);
}
    double ld0 = 689.5723085739489;
    ab4 = fb0 || fb1;
    double ld1 = 499.18495861937623;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - ld0;
    ld1 = ad1 - ad2;
    ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
    fb1 = ab1 && ab2;
    boolean lb2 = false;
    double ld3 = 880.4151150459013;
    ab2 = ab3 && ab4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 613.0831077100498;
    fd0 = fd1 - ld0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[3][7] += ld0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld0;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, fd0);
}
        fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        for(int i0=0; i0<10; i0++){
            double ld1 = 405.1109734899426;
            }
if(fo0 != null){
          fb0 = fo0.m2();
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought264.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    lb2 = fd0 < fd1;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    if (fb1) {
        Output.points[3][8] -= ad4;
        Output.points[4][0] += fd0;
        } else if (fb0) {
        double ld0 = 83.56290246442639;
        fd0 = fd1 - ld0;
        ad1 *= -1;
        } else {
        ad3 *= -1;
        fb1 = !fb0;
        Output.points[4][1] += ad4;
        Output.points[4][2] += fd0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1();
}
    Output.points[4][3] -= ad4;
    fd0 = fd1 - ad1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought105.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    ad3 = ad4 - fd0;
    Output.points[4][4] += fd1;
    fb1 = ab1 || ab2;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[4][5] -= ad2;
    fb1 = !lb1;
    ab1 = ad3 > ad4;
    ab2 = fd0 < fd1;
    ab3 = ad1 < ad2;
    ab4 = fb0 && fb1;
    boolean lb2 = false;
    Thought lo3 = Thought69.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
    ab3 = ad3 < ad4;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    lb1 = ad1 < ad2;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought388.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
        boolean lb2 = true;
    Output.points[4][6] -= fd1;
    Thought lo3 = Thought60.getInstance();
    fd0 *= -1;
    lb1 = !lb2;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb4, fb0, fb1, lb1);
}
    boolean lb5 = true;
    lb2 = lb4 || lb5;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    lb4 = fd1 < fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, lb4, lb5, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb1 = lb2 && lb4;
    lb5 = fb0 && fb1;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought178.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    boolean lb3 = false;
    ad4 = fd0 - fd1;
    lb2 = lb3 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb1, lb2, lb3);
}
    if (fb0) {
        fb1 = ad1 > ad2;
        Thought lo4 = Thought75.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, lb2, lb3, fb0);
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb1, lb1, lb2, lb3);
}
        double ld5 = 899.7088568118614;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb1, lb2, lb3);
}
        ad4 = fd0 + fd1;
        fb0 = !fb1;
        Thought lo6 = Thought184.getInstance(ao4, fo0, fo1, ao1);
        lb1 = lb2 || lb3;
        ld5 = ad1 - ad2;
        boolean lb7 = true;
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ld5);
}
        ad1 = ad2 - ad3;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld5);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ao2.m3();
}
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought388.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
    double ld1 = 867.1435236031413;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    double ld2 = 897.2583600316191;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    ad1 = ad2 - ad3;
    double ld0 = 236.29013656784812;
    Thought lo1 = Thought393.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ad3 < ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought391.getInstance(ad4, fd0, fd1, ld0);
    ad1 *= -1;
    double ld3 = 635.3109428567548;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought60.getInstance(fd1, fd0, fd1, fd0);
    Output.points[4][7] -= fd1;
    Output.points[4][8] += fd0;
    fd1 *= -1;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, lb0, ab1);
}
        ab2 = ab3 || ab4;
        Thought lo2 = Thought237.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 < fd0;
        double ld3 = 57.6385295685425;
        boolean lb4 = true;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad1 < ad2;
        ad3 = ad4 + fd0;
    fd1 *= -1;
    boolean lb1 = true;
    double ld2 = 27.530149905773772;
    lb1 = ld2 < ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fb0 = fd0 < fd1;
    fb1 = ld2 < ad1;
    Thought lo3 = Thought115.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought327.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
    lb0 = !lb1;
    ad4 = fd0 - fd1;
    ld2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    double ld5 = 387.9823023439783;
    fb0 = ld5 > ad1;
    fb1 = lb0 && lb1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ad3 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    double ld1 = 95.07543317561947;
    double ld2 = 94.2886163068666;
    Thought lo3 = Thought313.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2, ab4, fb0, fb1, lb0);
    double ld4 = 126.19119723184143;
    ab1 = ab2 && ab3;
    ab4 = ad2 > ad3;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought393.getInstance(ao1, ao2, ao3, ao4);
    double ld1 = 356.0596996801672;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    if (fb1) {
        fb0 = fd0 > fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
        fd0 = fd1 + ld1;
        double ld2 = 447.96833245426;
        fb1 = ld1 > fd0;
        if (fb0) {
            fd1 = ld2 - ld1;
if(fo1 != null){
              fd0 = fo1.m3();
}
if(ao2 != null){
              ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
}}
Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought112.getInstance(ao1, ao2, ao3, ao4);
    ad1 *= -1;
    fb0 = ad2 > ad3;
    double ld1 = 484.15263940977576;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2);
}
        boolean lb2 = false;
    fb0 = ad3 < ad4;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
        boolean lb3 = false;
    boolean lb4 = true;
    double ld5 = 257.3995421229891;
    lb4 = ad4 < fd0;
    Thought lo6 = Thought251.getInstance(fb0, fb1, lb2, lb3);
    Output.points[5][0] += fd1;
        lb4 = ld1 > ld5;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1, lb3, lb4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 && lb0;
            boolean lb1 = false;
            lb0 = ab1 && ab2;
            ab3 = ab4 && fb0;
            fb1 = lb1 || lb0;
            ab1 = fd0 < fd1;
if(ao3 != null){
              fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
              fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
}}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    lb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    Thought lo1 = Thought28.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
          ao1 = ao2.m4();
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    double ld0 = 574.4464580933627;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought48.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought177.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    ad1 *= -1;
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[5][1] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought96.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought298.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought329.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought87.getInstance(ad2, ad3, ad4, fd0);
    boolean lb3 = false;
    ab4 = fd1 > ad1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][2] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = lb1 && fb0;
    double ld2 = 49.296759366141174;
    Thought lo3 = Thought203.getInstance(fb1, lb0, lb1, fb0);
    double ld4 = 988.8977947598551;
    ld2 = ld4 - fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, ld4, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(ao3 != null){
      ld2 = ao3.m3(ld4, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    if (fb1) {
        boolean lb5 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb5, lb0, lb1, fb0);
}
        fb1 = ld4 > fd0;
        for(int i0=0; i0<10; i0++){
            Thought lo6 = Thought337.getInstance(ao4, fo0, fo1, ao1);
            boolean lb7 = true;
if(ao2 != null){
              ao2.m1(fd1, ld2, ld4, fd0);
}
            fd1 *= -1;
            lb7 = ld2 > ld4;
            lb5 = !lb0;
            fd0 *= -1;
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, ld4, fd0);
}
}}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    double ld0 = 935.727458547153;
    fb0 = fb1 || fb0;
    fb1 = ad3 < ad4;
    fb0 = fd0 > fd1;
    ld0 = ad1 + ad2;
    fb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    Output.points[5][3] -= fd1;
    ld0 = ad1 - ad2;
    lb1 = fb0 && fb1;
    double ld2 = 978.331596430303;
        ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    ld2 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought260.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, ld2, ad1, lb1, fb0, fb1, lb1);
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && ab1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
        ab4 = fb0 || fb1;
    ab1 = !ab2;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    double ld1 = 575.9239346913951;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = ld1 < fd0;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 47.13677303674087;
    ld0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld1 = 469.4549083037493;
    ad4 *= -1;
    fb1 = fd0 < fd1;
if(ao1 != null){
          fo1 = ao1.m4(ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    double ld2 = 500.3808288408793;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb3 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    ab4 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ld1, ld2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb3 = fd0 > fd1;
    Output.points[5][4] -= ld0;
    if (ab1) {
        ld1 = ld2 - ad1;
        ab2 = ab3 && ab4;
if(ao1 != null){
          ad2 = ao1.m3();
}
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[5][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 940.7342833084059;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fo0.m1();
}
    fb0 = fb1 || lb1;
    Output.points[5][6] += fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][7] -= fd0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
        Thought lo0 = Thought364.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought12.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb2, fb0);
}
    Output.points[5][8] += fd1;
    double ld3 = 669.0218048100841;
    double ld4 = 668.7144247592023;
    fb1 = !lb0;
    ld3 *= -1;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld4, lb2, fb0, fb1, lb0);
}
    fd0 *= -1;
    Thought lo5 = Thought381.getInstance(fd1, ld3, ld4, fd0, lb2, fb0, fb1, lb0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
