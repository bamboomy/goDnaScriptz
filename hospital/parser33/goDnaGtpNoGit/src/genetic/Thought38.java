package genetic;
import java.util.ArrayList;
class Thought38 extends Thought{
private static ArrayList<Thought38> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 189.59631484763932;
private double fd1 = 490.32443078334524;
private Thought fo0 = null;
private Thought fo1 = null;
Thought38 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought38 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought38 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 836.5812519073961;
    fb0 = ld0 < fd0;
    fd1 = ld0 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ld0 = fd0 + fd1;
    fb1 = lb1 && fb0;
    boolean lb2 = false;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb1;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    double ld3 = 41.87813279653332;
    boolean lb4 = false;
    Thought lo5 = Thought231.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3);
    if (lb1) {
        boolean lb6 = true;
        fd0 = fd1 - ld0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld7 = 213.11108512803074;
if(fo0 != null){
          fo0.m2(lb1, lb2, lb4, fb0);
}
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
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        fd0 *= -1;
        Thought lo0 = Thought55.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
        double ld1 = 903.470182863834;
        boolean lb2 = true;
        fd0 = fd1 - ld1;
        Thought lo3 = Thought292.getInstance(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = lb2 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld4 = 477.80082364325165;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, ld4, fd0);
}
        Output.points[3][3] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld4, fd0, fd1);
}
        ld1 = ld4 - fd0;
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
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought221.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad2 < ad3;
    Thought lo0 = Thought255.getInstance(ad4, fd0, fd1, ad1);
    Output.points[3][4] += ad2;
    fb1 = ad3 < ad4;
    Thought lo1 = Thought290.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo1.m3();
}
    ab1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought375.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    boolean lb3 = false;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought197.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought176.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    double ld4 = 281.5146700871284;
if(fo1 != null){
      ld4 = fo1.m3();
}
        double ld5 = 938.7757289610968;
    lb1 = ld5 < fd0;
    Output.points[3][5] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld4, ld5, fd0, fd1, lb2, fb0, fb1, lb1);
}
    Output.points[3][6] += ld4;
    ld5 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ld4, ld5, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ld4 *= -1;
    lb2 = ld5 > fd0;
    Output.points[3][7] += fd1;
    Output.points[3][8] += ld4;
    Thought lo6 = Thought278.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb2);
    fb0 = ld5 > fd0;
    fb1 = lb1 && lb2;
    fd1 *= -1;

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
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought146.getInstance();
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    Output.points[4][0] -= ad3;
    double ld2 = 744.9970326063386;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    boolean lb3 = true;
if(ao3 != null){
      fb0 = ao3.m2(ld2, ad1, ad2, ad3, fb1, lb0, lb3, fb0);
}
    ad4 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, lb3, fb0);
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
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    boolean lb1 = true;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought377.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    for(int i0=0; i0<10; i0++){
        Output.points[4][1] += fd1;
        lb0 = lb1 && ab1;
        fd0 = fd1 - fd0;
        Output.points[4][2] -= fd1;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ao2.m3(ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || lb1;
        boolean lb3 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
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
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
    if (ab4) {
        fb0 = !fb1;
        ab1 = ab2 && ab3;
if(ao1 != null){
          ao1.m3(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        ad2 *= -1;
        boolean lb0 = false;
        Output.points[4][3] += ad3;
        fb0 = ad4 > fd0;
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    Output.points[4][4] += fd1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
            fb1 = fd0 > fd1;
            double ld0 = 45.83942634788184;
if(fo0 != null){
              fo1 = fo0.m4();
}
            ld0 *= -1;
            fd0 = fd1 + ld0;
if(fo1 != null){
              fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
            fb1 = fd0 < fd1;
            for(int i2=0; i2<10; i2++){
                fb0 = fb1 && fb0;
                ld0 = fd0 + fd1;
                boolean lb1 = true;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
                fb1 = fd0 < fd1;
if(fo0 != null){
                  lb1 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
                fb1 = lb1 || fb0;
                double ld2 = 725.3435240575054;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
                ld0 = fd0 - fd1;
                lb1 = !fb0;
                ld2 *= -1;
}}}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
    Thought lo3 = Thought305.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought121.getInstance(fb0, fb1, lb0, lb1);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[4][5] -= ad1;
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = ad3 < ad4;
    double ld0 = 189.49519342275448;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = ad4 > fd0;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
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
    double ld0 = 421.0555512302433;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought278.getInstance();
    if (ab1) {
        Thought lo2 = Thought356.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        boolean lb3 = false;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo1.m3(lb3, ab1, ab2, ab3);
}
        ad4 = fd0 - fd1;
        ab4 = fb0 || fb1;
        lb3 = !ab1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        boolean lb4 = false;
        fb0 = fb1 && lb3;
        lb4 = ad4 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb3, lb4, ab1);
}
        ab2 = !ab3;
        ab4 = ad4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
        lb3 = fd1 > ld0;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought83.getInstance();
    Output.points[4][6] += fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo1 = Thought198.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;

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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought222.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought111.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld2 = 642.7457095759161;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ad4 = ao2.m3(fb1, fb0, fb1, fb0);
}
    double ld3 = 647.0007160298018;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    Output.points[4][7] -= fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab4 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab4 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    Output.points[4][8] += ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 952.5180938571466;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought49.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
    double ld3 = 309.7578120828355;
    fb1 = lb1 && fb0;
    double ld4 = 371.1594743764466;
    ld0 = ld3 + ld4;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb5);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 676.989585460307;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ab2 = !ab3;
    ld0 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb1, ab1, ab2);
}
    Thought lo2 = Thought127.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    Thought lo4 = Thought54.getInstance(ld0, fd0, fd1, ld0);

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
    ad1 = ad2 + ad3;
    Output.points[5][0] += ad4;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld0 = 780.1469440460265;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    ab1 = ab2 && ab3;
    double ld1 = 379.9441344614055;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = ad2 < ad3;
        fb1 = ab1 || ab2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 713.6874286688767;
    fb1 = fb0 || fb1;
    double ld1 = 35.0126346461685;
    Output.points[5][1] -= ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        Output.points[5][2] += ld0;
        boolean lb2 = true;
        Thought lo3 = Thought322.getInstance(fo1, ao1, ao2, ao3);
        if (fb0) {
if(ao4 != null){
              fb1 = ao4.m2(ld1, fd0, fd1, ld0);
}
            Thought lo4 = Thought12.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0);
            Thought lo5 = Thought149.getInstance();
            double ld6 = 488.42581909323866;
if(ao3 != null){
              ld0 = ao3.m3(lb2, fb0, fb1, lb2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    double ld3 = 318.3407322955639;
    double ld4 = 770.892439377989;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      lb2 = ao1.m2();
}
    fd1 = ld3 - ld4;
    Thought lo5 = Thought68.getInstance(fb0, fb1, lb0, lb1);
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
}
if(ao2 != null){
      ld4 = ao2.m3(ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
    boolean lb6 = false;
    boolean lb7 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
        fb0 = !fb1;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        lb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        Thought lo4 = Thought84.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
        lb1 = lb2 || lb3;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
        Thought lo5 = Thought146.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
        Thought lo6 = Thought71.getInstance(fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        Output.points[5][3] -= fd0;
        lb1 = fd1 < fd0;
        boolean lb7 = false;
        fd1 = fd0 - fd1;
        lb1 = lb2 || lb3;
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
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
    Thought lo0 = Thought12.getInstance();
    Thought lo1 = Thought9.getInstance(ab1, ab2, ab3, ab4);
    Thought lo2 = Thought381.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    Thought lo3 = Thought381.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    if (fb0) {
        ad4 *= -1;
        Thought lo4 = Thought385.getInstance(fo0, fo1, ao1, ao2);
        double ld5 = 585.2733318012378;
if(ao3 != null){
          fb1 = ao3.m2(ad4, fd0, fd1, ld5);
}
        ab1 = ad1 < ad2;
        ab2 = ad3 < ad4;
        ab3 = ab4 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld5, ad1);
}
        fb1 = ab1 || ab2;
        Thought lo6 = Thought246.getInstance();
        if (ab3) {
if(fo0 != null){
              ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
            boolean lb7 = true;
            Thought lo8 = Thought269.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(ao4 != null){
              fd1 = ao4.m3(ld5, ad1, ad2, ad3, fb0, fb1, lb7, ab1);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
            ad4 = fd0 + fd1;
            fb1 = ld5 > ad1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            double ld9 = 904.0766252507941;
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[5][4] += fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought354.getInstance();
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    boolean lb1 = true;
    Thought lo2 = Thought77.getInstance(fb0, fb1, lb1, fb0);
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought293.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 205.85110501867862;
    ab1 = ld1 > fd0;
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
    Output.points[5][5] += ld1;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought325.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
        Thought lo4 = Thought136.getInstance();
        fd1 *= -1;
        ab2 = !ab3;
if(fo0 != null){
          fo0.m2(ab4, fb0, fb1, lb2);
}
        ld1 *= -1;
        boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo1 != null){
          fd1 = fo1.m3(ld1, fd0, fd1, ld1, lb5, lb2, ab1, ab2);
}
        ab3 = fd0 < fd1;
        ab4 = fb0 && fb1;
        boolean lb6 = false;
        lb5 = ld1 > fd0;
        lb6 = lb2 && ab1;
        fd1 *= -1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][6] -= ad1;
    Thought lo0 = Thought139.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    lb1 = fb0 && fb1;
    lb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    Output.points[5][7] += fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        lb1 = fd0 > fd1;
        fb0 = ad1 > ad2;
        ad3 = ad4 + fd0;
        fb1 = fd1 > ad1;
        boolean lb2 = true;
        Thought lo3 = Thought348.getInstance();
        lb2 = ad2 < ad3;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][8] += ad2;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    double ld0 = 800.6246939693713;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ad3 *= -1;
    double ld1 = 198.33076054690554;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought287.getInstance(ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
    ld0 = ld1 + ad1;
    if (fb0) {
        Output.points[6][0] -= ad2;
        ad3 = ad4 - fd0;
        Thought lo3 = Thought100.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1, fb1, ab1, ab2, ab3);
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
    fb1 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 293.1441091726777;
    Output.points[6][1] += ld1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought152.getInstance(ao1, ao2, ao3, ao4);
    boolean lb3 = true;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
        ld1 = fd0 + fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    double ld0 = 259.39234379059116;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought356.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    fb1 = !fb0;
    Output.points[6][2] += ld0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fb1 && fb0;
    double ld2 = 743.2796837688854;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought363.getInstance(lb4, fb0, fb1, lb3);
    lb4 = ld2 < ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb3;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb3);
}
        lb4 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld2, ad1, lb3, lb4, fb0, fb1);
}
        boolean lb6 = false;
        lb6 = !lb3;
        ad2 = ad3 - ad4;
        fd0 *= -1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, lb4, fb0, fb1, lb6);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = fd1 < fd0;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
    fd1 *= -1;
    ab3 = fd0 > fd1;
    Thought lo2 = Thought318.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fd0 > fd1;
    Output.points[6][3] += fd0;
    Output.points[6][4] += fd1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = lb0 && lb1;
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return ao1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    fb0 = fd1 < ad1;
if(ao4 != null){
          fb1 = ao4.m2(lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    if (ab3) {
        Output.points[6][5] += ad2;
        ad3 = ad4 - fd0;
        Thought lo2 = Thought141.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
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
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought165.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    Thought lo1 = Thought359.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought33.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo3 = Thought111.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
        fb1 = fd1 > fd0;

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
    Thought lo0 = Thought212.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
          fb0 = fo0.m2();
}
    fb1 = !fb0;
    Thought lo1 = Thought284.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[6][6] += fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[6][7] += fd0;
    boolean lb2 = true;

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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 585.3463140853618;
    fb1 = ld0 < fd0;
    Thought lo1 = Thought15.getInstance(fd1, ld0, fd0, fd1);
    fb0 = fb1 && fb0;
    boolean lb2 = false;
    Output.points[6][8] += ld0;
    boolean lb3 = false;
    fd0 = fd1 + ld0;
    double ld4 = 133.8907286692524;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld0, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m2(ld4, fd0, fd1, ld0, lb3, fb0, fb1, lb2);
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
}
