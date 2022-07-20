package genetic;
import java.util.ArrayList;
class Thought82 extends Thought{
private static ArrayList<Thought82> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 242.20065536076262;
private double fd1 = 104.6646155650236;
private Thought fo0 = null;
private Thought fo1 = null;
Thought82 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought82 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought82 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought82 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought82 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m3();
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[0][0] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb1 = fo0.m2(lb2, ab1, ab2, ab3);
}
    double ld3 = 869.7979481001614;
    ld3 = fd0 - fd1;
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, ab4, fb0, fb1, lb0);
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
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    Output.points[0][1] += ad1;
    double ld1 = 616.0025115941304;
    Thought lo2 = Thought352.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            lb0 = fd1 < ld1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought203.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
    ab3 = fd1 < ad1;
    ab4 = fb0 || fb1;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    Thought lo2 = Thought90.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    Thought lo3 = Thought244.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    Output.points[0][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;

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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    if (fb1) {
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fd0 *= -1;
        Thought lo0 = Thought201.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            for(int i1=0; i1<10; i1++){
                boolean lb1 = true;
if(ao4 != null){
                  lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
                  ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
                lb1 = fd1 > fd0;
                fb0 = fb1 && lb1;
if(fo1 != null){
                  fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
                fd1 *= -1;
                Output.points[0][3] += fd0;
                boolean lb2 = false;
                boolean lb3 = false;
                lb3 = fb0 && fb1;
                for(int i2=0; i2<10; i2++){
if(fo0 != null){
                      lb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
                    Output.points[0][4] += fd1;
if(ao4 != null){
                      ao4.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
                      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
}}}}
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
      ao1 = ao2.m4();
}
    Output.points[0][5] -= ad1;
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    double ld0 = 333.3777520758373;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[0][6] -= ad4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld1 = 883.0342693713914;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ld0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
if(ao4 != null){
      lb2 = ao4.m2(ld1, ad1, ad2, ad3);
}
    fb0 = fb1 && lb2;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo0.m2();
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
    ab2 = fd0 < fd1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    lb0 = fd0 < fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[0][7] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
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
    double ld0 = 117.97529522542399;
    ab2 = ld0 > ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought383.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad2 = fo1.m3();
}
if(ao1 != null){
          ao1.m3(ab3, ab4, fb0, fb1);
}
        ad3 *= -1;
        boolean lb2 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
        ad1 = ad2 + ad3;
        ab4 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
        boolean lb3 = true;
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
}
        boolean lb4 = false;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb1) {
        fb0 = !fb1;
        boolean lb0 = true;
        fd1 = fd0 + fd1;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
        fd0 *= -1;
        Thought lo1 = Thought25.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        boolean lb2 = true;
        boolean lb3 = false;
        boolean lb4 = false;
if(fo0 != null){
          lb2 = fo0.m2();
}
        boolean lb5 = false;
        fd1 *= -1;
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
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    double ld1 = 852.7973412206312;
    Thought lo2 = Thought260.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        fd1 = ld1 - fd0;
    lb0 = ab1 || ab2;
    ab3 = !ab4;
    Thought lo3 = Thought113.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld1;
    Thought lo4 = Thought150.getInstance(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    Output.points[0][8] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    double ld5 = 547.2270831991494;

Thought.STACK_COUNTER++;
return ab2;
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
    if (fb1) {
        ad1 = ad2 + ad3;
        fb0 = fb1 || fb0;
        Thought lo0 = Thought46.getInstance();
        boolean lb1 = false;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, fb0);
}
        ad4 *= -1;
        fb1 = lb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
        fb0 = ad1 < ad2;
        fb1 = lb1 && fb0;
        boolean lb2 = true;
        fb0 = fb1 || lb1;
        lb2 = ad3 > ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought307.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
        fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    Output.points[1][0] -= fd1;
    ad1 = ad2 + ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 515.0786505809311;
    Output.points[1][1] -= fd0;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 124.44866381870916;
    double ld2 = 556.9602053451958;
    ld2 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ld1, ld2);
}
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
}
    fb0 = fb1 || lb3;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld2 *= -1;
    if (lb3) {
        boolean lb4 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb0 = !fb1;
    double ld0 = 993.7041649287684;
    fb0 = !fb1;
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ld0, ad1);
}
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought73.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > ld0;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought148.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought168.getInstance(fo0, fo1, ao1, ao2);
    double ld4 = 713.9231657093595;

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
    ab2 = !ab3;
    fd0 = fd1 + fd0;
    ab4 = fd1 < fd0;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao3.m3();
}
    if (ab1) {
        ab2 = fd1 < fd0;
        fd1 *= -1;
        ab3 = ab4 && fb0;
        fb1 = !ab1;
        ab2 = ab3 || ab4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = true;
    double ld1 = 572.0156913132062;
    lb0 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought204.getInstance();
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
        Output.points[1][2] += fd1;
    Output.points[1][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought61.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return fd0;
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
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Thought lo0 = Thought350.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    Thought lo1 = Thought199.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought240.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Output.points[1][4] += fd0;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fd0;
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
    Output.points[1][5] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fb1 = ad2 < ad3;
        Output.points[1][6] += ad4;
        fd0 *= -1;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        ad4 = fd0 - fd1;
        fb1 = fb0 || fb1;
        ad1 = ad2 - ad3;
}
Thought.STACK_COUNTER++;
return ad4;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb1 = false;
    double ld2 = 777.1787076475556;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
    lb0 = lb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    double ld4 = 576.6648625446561;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    ld4 = ad1 + ad2;

Thought.STACK_COUNTER++;
return ad3;
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
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    lb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    if (fb0) {
        fb1 = !lb0;
        lb1 = ad4 > fd0;
        Output.points[1][7] += fd1;
        ad1 = ad2 + ad3;
if(ao3 != null){
          ao3.m3();
}
        double ld2 = 429.09495955075175;
if(ao4 != null){
          ao4.m3(fb0, fb1, lb0, lb1);
}
        ad3 *= -1;
        ad4 *= -1;
        Thought lo3 = Thought154.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ad1, fb0, fb1, lb0, lb1);
}
Thought.STACK_COUNTER++;
return ad3;
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
    Output.points[1][8] -= fd1;
    Thought lo0 = Thought97.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought81.getInstance(ao1, ao2, ao3, ao4);
    ab3 = fd0 < fd1;
    boolean lb2 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      ao2.m3(fb1, lb2, ab1, ab2);
}
    fd0 = fd1 - fd0;
    Output.points[2][0] -= fd1;
    Thought lo3 = Thought81.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    lb2 = ab1 && ab2;
    fd0 *= -1;
    double ld4 = 228.6148341857041;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought226.getInstance(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
    Thought lo6 = Thought163.getInstance(ao1, ao2, ao3, ao4);
    Output.points[2][1] += fd1;
    ab4 = ld4 < fd0;
    fd1 = ld4 - fd0;
    fd1 *= -1;
    if (fb0) {
        double ld7 = 845.4305718957174;
        Output.points[2][2] -= ld7;
}
Thought.STACK_COUNTER++;
return fd0;
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
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought4.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1();
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        if (lb1) {
            double ld2 = 776.6388191383533;
            ab1 = !ab2;
if(ao1 != null){
              ab3 = ao1.m2(ab4, fb0, fb1, lb1);
}
            Output.points[2][3] -= ad3;
            ab1 = !ab2;
}}
Thought.STACK_COUNTER++;
return fd0;
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
    fb1 = fd1 > fd0;
        fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought132.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
    fd1 *= -1;
    fb0 = fb1 && lb1;
    fb0 = fd0 > fd1;
    fb1 = lb1 && fb0;
    Thought lo2 = Thought213.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    fb1 = fd1 > fd0;
    lb1 = !fb0;
        Output.points[2][4] -= fd1;
    fd0 *= -1;
    Output.points[2][5] += fd1;
    Output.points[2][6] -= fd0;
        fb1 = fd1 > fd0;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}

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
    double ld0 = 346.30850342744696;
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought69.getInstance();
    fb1 = fd1 > ld0;
    fd0 = fd1 - ld0;
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb2, ab1);
}
        fd1 *= -1;
    ab2 = ld0 < fd0;
    fd1 = ld0 + fd0;
    ab3 = fd1 > ld0;

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
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought73.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought118.getInstance(fd0, fd1, ad1, ad2);
    fb1 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb2);
}
    lb3 = fd0 > fd1;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb3 = lb4 && fb0;
    ad1 = ad2 + ad3;

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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    ab4 = ad3 > ad4;
    Thought lo0 = Thought114.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    if (fb1) {
        lb1 = ad4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        Output.points[2][7] += ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
        double ld2 = 673.3802185590719;
        boolean lb3 = false;
        ab1 = !ab2;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        Thought lo4 = Thought205.getInstance(ad4, fd0, fd1, ld2);
        ab3 = !ab4;
        } else if (fb1) {
        ad2 *= -1;
}
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
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    double ld0 = 875.2090491498556;
    fb0 = ld0 < fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2();
}
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought79.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought254.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
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
    Output.points[2][8] += ad1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    if (fb0) {
        ad3 = ad4 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        fb1 = ad4 > fd0;
        double ld0 = 824.5150533613678;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 + ad1;
        fb0 = !fb1;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        } else {
        fb1 = fb0 || fb1;
        fb0 = ad3 < ad4;
if(ao1 != null){
          fb1 = ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb1 = ad1 > ad2;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ad3 = ad4 + fd0;
        fd1 *= -1;
        ad1 *= -1;
}
Thought.STACK_COUNTER++;
return ao3;
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
    ab1 = ab2 && ab3;
    Output.points[3][0] += fd1;
    boolean lb0 = true;
    double ld1 = 197.82961221885068;
    ld1 = fd0 - fd1;
    Output.points[3][1] -= ld1;
    ab3 = fd0 < fd1;
    Thought lo2 = Thought352.getInstance(ab4, fb0, fb1, lb0);
    double ld3 = 840.9107385603552;
    ld1 *= -1;
    ld3 *= -1;
    ab1 = ab2 && ab3;
    Thought lo4 = Thought65.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld3, ab4, fb0, fb1, lb0);
    boolean lb5 = true;
    Thought lo6 = Thought197.getInstance(fd0, fd1, ld1, ld3, lb5, ab1, ab2, ab3);
    boolean lb7 = false;
    double ld8 = 528.9039864225856;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, lb5, lb7);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld8, fd0, fd1, ld1);
}
    ld3 = ld8 + fd0;

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
    boolean lb0 = false;
    ab1 = ad1 < ad2;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    boolean lb1 = true;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[3][2] -= ad2;
if(ao1 != null){
          fo1 = ao1.m4();
}
    boolean lb2 = true;
    lb0 = ad3 > ad4;
if(ao2 != null){
      fd0 = ao2.m3(lb1, lb2, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb0, lb1, lb2, ab1);
}
    boolean lb3 = true;
    double ld4 = 867.4742713854802;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    lb1 = lb2 || lb3;
    ad2 = ad3 - ad4;
    Thought lo5 = Thought112.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld4, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad1 = ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    double ld6 = 635.6735574119244;
    Output.points[3][3] -= fd0;

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
    fd1 = fd0 + fd1;
    Output.points[3][4] += fd0;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought363.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - fd0;
    double ld2 = 266.79118603648664;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought94.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
    Thought lo4 = Thought153.getInstance();
        ld2 *= -1;

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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought309.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[3][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Output.points[3][6] += fd0;
    double ld1 = 950.5422317689149;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
    Output.points[3][7] -= fd1;
    fb1 = ld1 < fd0;

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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 && fb1;
    Thought lo2 = Thought329.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
    boolean lb4 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    lb0 = lb1 && lb3;

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
